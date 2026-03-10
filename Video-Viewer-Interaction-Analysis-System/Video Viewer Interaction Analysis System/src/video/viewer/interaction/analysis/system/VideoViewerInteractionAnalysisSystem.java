package video.viewer.interaction.analysis.system;

public class VideoViewerInteractionAnalysisSystem {

    public static void main(String[] args) {

        // إنشاء فيديو
        Video video = new Video(101, "Java Tutorial", 120.5);

        // طباعة معلومات الفيديو
        System.out.println("Video ID: " + video.getVideoId());
        System.out.println("Video Title: " + video.getTitle());
        System.out.println("Video Duration: " + video.getDuration());
         System.out.println("Video Duration: " + video.getDuration());
    }
}