package joost.modules;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import java.util.*;

/**
 * Created by Joost on 18/10/2014.
 * Class to handle notifications
 */
public class NotificationModule {

    private NotificationManager mNotificationManager;
    private Context context;
    private ArrayList<NotificationCompat.Builder> notificationBuilderArray = new ArrayList<NotificationCompat.Builder>();

    /*
    Constructor
     */
    public NotificationModule(Context context) {
        this.context = context;
        mNotificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
    }

    /*
    Basic notification constructor with input variables
     */
    public int newNotification(int icon, String title, String content) {
        notificationBuilderArray.add(new NotificationCompat.Builder(context).setSmallIcon(icon).setContentTitle(title).setContentText(content));
        return notificationBuilderArray.size()-1;
    }

    /*
    Basic notification constructor with notificationcompat builder object
     */
    public int newNotification(NotificationCompat.Builder notificationBuilder) {
        notificationBuilderArray.add(notificationBuilder);
        return notificationBuilderArray.size()-1;
    }

    /*
    Basic notification constructor without input variables
     */
    public int newNotification() {
        notificationBuilderArray.add(new NotificationCompat.Builder(context));
        return notificationBuilderArray.size()-1;
    }

    /*
    Set smallIcon of existing notification
     */
    public void setSmallIcon(int id, int icon) {
        try {
            notificationBuilderArray.get(id).setSmallIcon(icon);
        } catch (IndexOutOfBoundsException e) {

        }
    }

    /*
    Set title of existing notification
     */
    public void setSmallIcon(int id, String title) {
        try {
            notificationBuilderArray.get(id).setContentTitle(title);
        } catch (IndexOutOfBoundsException e) {

        }
    }

    /*
    Set content of existing notification
     */
    public void setContent(int id, String content) {
        try {
            notificationBuilderArray.get(id).setContentText(content);
        } catch (IndexOutOfBoundsException e) {

        }
    }

    /*
    Send notify notification (push to phone) (Same id is used in notify as the notification is)
     */
    public void notifyNotification(int id){
        try {
            mNotificationManager.notify(id,notificationBuilderArray.get(id).build());
        } catch (IndexOutOfBoundsException e) {

        }
    }

    /*
    Send notify notification (push to phone) (other id is used in notify as the notification is)
     */
    public void notifyNotification(int notifyId, int notificationId){
        try {
            mNotificationManager.notify(notifyId,notificationBuilderArray.get(notificationId).build());
        } catch (IndexOutOfBoundsException e) {

        }
    }
}
