package t8;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes.dex */
final class q extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f21345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g gVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f21345b = gVar;
        this.f21344a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        g gVar = this.f21345b;
        int iG = gVar.g(this.f21344a);
        if (gVar.j(iG)) {
            this.f21345b.o(this.f21344a, iG);
        }
    }
}
