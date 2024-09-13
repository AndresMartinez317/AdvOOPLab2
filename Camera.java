public class Camera {
    String model;
    String OS;
    int Screen_size;
    int memory;
    String front_camera;
    int Price;

    public Camera(String model, String OS, int screen_size, int memory, String front_camera, int price) {
       setModel(model);
       setOS(OS);
       setScreen_size(screen_size);
       setMemory(memory);
       setFront_camera(front_camera);
       setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        try{
            this.OS = OS;
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public int getScreen_size() {
        return Screen_size;
    }

    public void setScreen_size(int screen_size) {
        try{
            this.Screen_size = screen_size;
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        try{
            this.memory = memory;
        }catch(Exception e){
            System.out.println("Error");
        }

    }

    public String getFront_camera() {
        return front_camera;
    }

    public void setFront_camera(String front_camera) {
        try{
            this.front_camera = front_camera;
        }catch(Exception e){
            System.out.println("Error");
        }

    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        try{
            this.Price = price;
        }catch(Exception e){
            System.out.println("Error");
        }

    }
}
