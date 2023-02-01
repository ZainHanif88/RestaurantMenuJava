public class MumsCurry extends Fooddishes{
    @Override
    public void addFooddishes() {
        System.out.println("Add Curry:");
        super.Fooddishes.add("Curry");

        System.out.println("Curry added:");
        System.out.println(Fooddishes);
    }
}
