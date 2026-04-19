package t8;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.g;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import w8.c0;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class g extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21326c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21324e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f21325f = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21323d = h.f21327a;

    public static g m() {
        return f21325f;
    }

    @Override // t8.h
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // t8.h
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // t8.h
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // t8.h
    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    @Override // t8.h
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // t8.h
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, c0.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.A() ? bVar.z() : c(context, bVar.u(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i10, i11, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        t(context, i10, null, d(context, i10, 0, "n"));
    }

    final Dialog p(Context context, int i10, c0 c0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(w8.z.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = w8.z.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = c0Var;
        if (strB != null) {
            if (c0Var == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = w8.z.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(w8.z.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final v8.t r(Context context, v8.s sVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        v8.t tVar = new v8.t(sVar);
        zao.zaa(context, tVar, intentFilter);
        tVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return tVar;
        }
        sVar.a();
        tVar.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.o) {
                o.S(dialog, onCancelListener).R(((androidx.fragment.app.o) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [android.app.NotificationChannel] */
    final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = w8.z.e(context, i10);
        String strD = w8.z.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) w8.m.k(context.getSystemService("notification"));
        g.d dVarN = new g.d(context).k(true).e(true).i(strE).n(new g.b().h(strD));
        if (e9.g.c(context)) {
            w8.m.n(e9.l.e());
            dVarN.m(context.getApplicationInfo().icon).l(2);
            if (e9.g.d(context)) {
                dVarN.a(s8.a.f20425a, resources.getString(s8.b.f20440o), pendingIntent);
            } else {
                dVarN.g(pendingIntent);
            }
        } else {
            dVarN.m(R.drawable.stat_sys_warning).o(resources.getString(s8.b.f20433h)).p(System.currentTimeMillis()).g(pendingIntent).h(strD);
        }
        if (e9.l.h()) {
            w8.m.n(e9.l.h());
            synchronized (f21324e) {
                str2 = this.f21326c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(s8.b.f20432g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new Parcelable(str2, string, 4) { // from class: android.app.NotificationChannel
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ CharSequence getName();

                        public native /* synthetic */ void setName(CharSequence charSequence);
                    });
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarN.f(str2);
        }
        Notification notificationB = dVarN.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            l.f21333b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }

    final void u(Context context) {
        new q(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean v(Activity activity, v8.f fVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i10, c0.c(fVar, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b bVar, int i10) {
        PendingIntent pendingIntentL;
        if (g9.b.a(context) || (pendingIntentL = l(context, bVar)) == null) {
            return false;
        }
        t(context, bVar.u(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i10, true), zap.zaa | 134217728));
        return true;
    }
}
