public class chw_316 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Java");

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(6, "World ");
        System.out.println(sb);

        sb.replace(6, 11, "Everyone");
        System.out.println(sb);

        sb.delete(6, 14);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
