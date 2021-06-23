public class TestQueue { //do i need to make it generic
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("Adam");
        queue.enqueue("Iman");
        queue.enqueue("Umar");
        queue.enqueue("Nuh");

        System.out.println(queue.toString());
    }
}
