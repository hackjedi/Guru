package joost.modules;

import android.content.Context;
import android.support.v4.app.NotificationCompat;

import static android.support.v4.app.NotificationCompat.*;

/**
 * Created by Joost on 24/10/2014.
 */
public class NotificationBuilder extends Builder {
    private String title;
    private String content;
    private int smallIcon;


    public NotificationBuilder(Context context) {
        super(context);

    }

    @Override
    public NotificationBuilder setSmallIcon(int icon) {
        this.smallIcon = icon;
        super.setSmallIcon(icon);
        return this;
    }

    @Override
    public NotificationBuilder setContentTitle(CharSequence title) {
        this.title = title.toString();
        super.setContentTitle(title);
        return this;
    }

    @Override
    public NotificationBuilder setContentText(CharSequence text) {
        this.content = text.toString();
        super.setContentText(text);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getSmallIcon() {
        return smallIcon;
    }

}
