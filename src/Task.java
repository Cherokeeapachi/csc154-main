public class Task {
    private String title;
    private String status;
    private String description;

    public Task(String title, String status, String description) {
        this.title = title;
        this.status = status;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
