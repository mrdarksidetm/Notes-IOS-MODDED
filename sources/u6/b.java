package u6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.lifecycle.g;
import androidx.lifecycle.n;
import s6.d3;
import s6.f1;
import u6.f;

/* JADX INFO: loaded from: classes.dex */
class b extends BroadcastReceiver implements androidx.lifecycle.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f21688f = f1.a("7F06");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f21689g = f1.b(f1.c("542B0226AE2C40468811137A3E791534F6014B5B751F3C5B55AB6D736B93"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f21690h = f1.b(f1.c("76073B41860D7069A6"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f21691i = f1.b(f1.c("76073B41860D7064BC317E"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f21692j = f1.b(f1.c("76073B41860D7072B0356971"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final IntentFilter f21693k = new IntentFilter(f1.b(f1.c("542B0226AE2C40468811137A3E791534F6014B5B751F3C5B55AB6D736B93")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3 f21694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f21695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f21696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21697d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.g f21698e = n.l().getLifecycle();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21699a;

        static {
            int[] iArr = new int[g.a.values().length];
            f21699a = iArr;
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21699a[g.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(Context context, d3 d3Var, f.a aVar) {
        this.f21696c = context;
        this.f21694a = d3Var;
        this.f21695b = aVar;
    }

    public final synchronized void a(Context context) {
        Context applicationContext;
        if (context != null) {
            if (!this.f21697d && (applicationContext = context.getApplicationContext()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationContext.registerReceiver(this, f21693k, 4);
                } else {
                    applicationContext.registerReceiver(this, f21693k);
                }
                this.f21697d = true;
            }
        }
    }

    public final void b(String str) {
        d3 d3Var;
        if (str.equals(f1.a("7F06")) && (d3Var = this.f21694a) != null) {
            d3Var.y();
        } else {
            f1.b(f1.c("7F06"));
            f1.b(f1.c("622A0466A6344101AC361D59347E0F33F8070A5D7913376146BC7F3426D8"));
        }
    }

    public void c(Context context) {
        if (context != null) {
            a(context);
            d3 d3Var = this.f21694a;
            if (d3Var != null) {
                d3Var.G();
            }
        }
        this.f21698e.a(this);
    }

    public synchronized void d(Context context) {
        Context applicationContext;
        if (context != null) {
            if (this.f21697d && (applicationContext = context.getApplicationContext()) != null) {
                applicationContext.unregisterReceiver(this);
                this.f21697d = false;
            }
            this.f21694a.H();
        } else {
            this.f21694a.H();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        d3 d3Var;
        if (intent != null) {
            if (intent.hasExtra(f1.a("76073B41860D7069A6"))) {
                String stringExtra2 = intent.getStringExtra(f1.b(f1.c("76073B41860D7069A6")));
                if (stringExtra2 != null) {
                    b(stringExtra2);
                    return;
                }
                return;
            }
            if (intent.hasExtra(f1.b(f1.c("76073B41860D7064BC317E")))) {
                String stringExtra3 = intent.getStringExtra(f1.b(f1.c("76073B41860D7064BC317E")));
                if (stringExtra3 == null || (d3Var = this.f21694a) == null) {
                    return;
                }
                d3Var.z(stringExtra3);
                return;
            }
            if (intent.hasExtra(f1.b(f1.c("76073B41860D7072B0356971"))) && (stringExtra = intent.getStringExtra(f1.b(f1.c("76073B41860D7072B0356971")))) != null && s6.e.a("7503", stringExtra)) {
                d(context);
            }
        }
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        int i10 = a.f21699a[aVar.ordinal()];
        if (i10 == 1) {
            d(this.f21696c);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f21695b.c();
            a(this.f21696c);
        }
    }
}
