package video.viewer.interaction.analysis.system;

public class Video {

    private final int videoId;
    private final String title;
    private final double duration;

    public Video(int videoId, String title, double duration) {
        this.videoId = videoId;
        this.title = title;
        this.duration = duration;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}