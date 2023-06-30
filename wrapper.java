class wrapper {
    public static void main(String[] args) {

        Integer obj1 = Integer.valueOf(23);
        Double obj2 = Double.valueOf(5.55);
        Boolean obj3 = Boolean.valueOf(true);
        Float obj4 = Float.valueOf(34.5F);
        Long obj5 = Long.valueOf(455L);

        int a1 = obj1.intValue();
        double a2 = obj2.doubleValue();
        boolean a3 = obj3.booleanValue();
        float a4 = obj4.floatValue();
        long a5 = obj5.longValue();

        System.out.println("The value of int variable: " + a1);
        System.out.println("The value of double variable: " + a2);
        System.out.println("The value of boolean variable: " + a3);
        System.out.println("The value of float variable: " + a4);
        System.out.println("The value of long variable: " + a5);
    }
}
