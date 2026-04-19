package dev.fluttercommunity.plus.share;

import ae.j;
import ae.r;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10062a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f10063b = "";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final String a() {
            return SharePlusPendingIntent.f10063b;
        }

        public final void b(String str) {
            r.f(str, "<set-?>");
            SharePlusPendingIntent.f10063b = str;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        r.f(context, "context");
        r.f(intent, "intent");
        ComponentName componentName = (ComponentName) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT"));
        if (componentName != null) {
            String strFlattenToString = componentName.flattenToString();
            r.e(strFlattenToString, "flattenToString(...)");
            f10063b = strFlattenToString;
        }
    }
}
