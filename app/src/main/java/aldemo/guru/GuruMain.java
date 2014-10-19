package aldemo.guru;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import joost.modules.NotificationModule;


public class GuruMain extends Activity {

    Button notificationButton;
    Context context;
    NotificationManager mNotificationManager;
    int i = 0;
    NotificationModule notificationModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_main);

        notificationModule = new NotificationModule(getApplicationContext());
        //context = getApplicationContext();
        //mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationButton = (Button)findViewById(R.id.buttonNotification);
        notificationButton.setOnClickListener(new OnClickListener() {
              @Override
              public void onClick(View view) {

//                  NotificationCompat.Builder mBuilder =
//                          new NotificationCompat.Builder(context)
//                                  .setSmallIcon(R.drawable.ic_launcher)
//                                  .setContentTitle("My notification")
//                                  .setContentText("Hello World! "+Integer.toString(i++));
//                  mNotificationManager.notify(0, mBuilder.build());
                  notificationModule.notifyNotification(notificationModule.newNotification(R.drawable.ic_launcher,"Title","Context text hello how much can we get in here"));

                  //Toast notificationToast = Toast.makeText(context, "test notification", Toast.LENGTH_SHORT);
                  //notificationToast.show();
              }
          }

        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.guru_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
