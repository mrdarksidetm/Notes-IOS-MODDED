package android.app;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class Notification$CallStyle extends Notification.Style {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ Notification$CallStyle forIncomingCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2);

    public static native /* synthetic */ Notification$CallStyle forOngoingCall(Person person, PendingIntent pendingIntent);

    public static native /* synthetic */ Notification$CallStyle forScreeningCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2);

    public native /* synthetic */ Notification$CallStyle setAnswerButtonColorHint(int i10);

    public native /* synthetic */ Notification$CallStyle setDeclineButtonColorHint(int i10);

    public native /* synthetic */ Notification$CallStyle setIsVideo(boolean z10);

    public native /* synthetic */ Notification$CallStyle setVerificationIcon(Icon icon);

    public native /* synthetic */ Notification$CallStyle setVerificationText(CharSequence charSequence);
}
