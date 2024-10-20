public class ResourceDemo {
    private String resourceName;

    // Constructor to initialize the resource
    public ResourceDemo(String name) {
        resourceName = name;
        System.out.println("Resource '" + resourceName + "' is created.");
    }

    // Method to simulate resource usage
    public void useResource() {
        System.out.println("Resource '" + resourceName + "' is being used.");
    }

    // finalize() method to simulate resource cleanup
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource '" + resourceName + "' is being cleaned up.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        ResourceDemo resource1 = new ResourceDemo("Resource1");
        ResourceDemo resource2 = new ResourceDemo("Resource2");

        resource1.useResource();
        resource2.useResource();

        
        resource1 = null;
        resource2 = null;

        
        System.gc();

        // In a real application, you wouldn't explicitly call System.gc().
        // The JVM's garbage collector runs automatically when needed.
    }
}
