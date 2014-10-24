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
    public Builder setSmallIcon(int icon) {
        this.smallIcon = icon;
        return super.setSmallIcon(icon);
    }

    @Override
    public Builder setContentTitle(CharSequence title) {
        this.title = title.toString();
        return super.setContentTitle(title);
    }

    @Override
    public Builder setContentText(CharSequence text) {
        this.content = text.toString();
        return super.setContentText(text);
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
