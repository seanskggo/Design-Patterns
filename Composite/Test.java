package Composite;

public class Test {

    public static boolean evaluate(BooleanNode expression) {
        // Return the expression evaluated
        return expression.evaluate();
    }

    public static String prettyPrint(BooleanNode expression) {
        // Pretty print the expression
        return expression.getPretty();
    }

    public static void main(String[] args) {

        // Test 1 => (AND true false) : false
        System.out.println("------ TEST 1 ------");
        BooleanNode l1 = new Leaf(true);
        BooleanNode l2 = new Leaf(false);
        BooleanNode c1 = new CompositeAnd(l1, l2);
        System.out.println(Test.evaluate(c1));
        System.out.println(Test.prettyPrint(c1));

        // Test 1 => (OR false (NOT false)) : true
        System.out.println("------ TEST 2 ------");
        l1 = new Leaf(false);
        c1 = new CompositeNot(l1);
        BooleanNode c2 = new CompositeOr(l2, c1);
        System.out.println(Test.evaluate(c2));
        System.out.println(Test.prettyPrint(c2));

        // Test 3 => (OR true (NOT (AND false (OR true false)))) : true
        System.out.println("------ TEST 3 ------");
        l1 = new Leaf(true);
        l2 = new Leaf(false);
        c1 = new CompositeOr(l1, l2);
        BooleanNode l3 = new Leaf(false);
        c2 = new CompositeAnd(l3, c1);
        BooleanNode c3 = new CompositeNot(c2);
        BooleanNode l4 = new Leaf(true);
        BooleanNode c4 = new CompositeOr(l4, c3);
        System.out.println(Test.evaluate(c4));
        System.out.println(Test.prettyPrint(c4));
    }

}