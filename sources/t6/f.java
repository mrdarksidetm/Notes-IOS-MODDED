package t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import s6.f1;

/* JADX INFO: loaded from: classes.dex */
public class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21290c = f1.a("7E0A294796076E75A5");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21291d = f1.b(f1.c("6305235B8C007068AA3272"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21293b;

    public interface a {
        void b();

        void c();

        void d();

        void e();

        void m();
    }

    public interface b {
        void a(List<t6.b> list);

        void f();

        void g();

        void h();

        void i();

        void j();

        void k();

        void l();

        void n();
    }

    public f(b bVar, a aVar) {
        if (bVar == null) {
            throw new IllegalArgumentException(f1.a("74250364AB224C4A97545E553F631326BF004F0F72053E641E"));
        }
        this.f21292a = bVar;
        this.f21293b = aVar;
    }

    public void a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException(f1.a("742B017CAC3B5B018715535A3E795C30FA42445A701C7C"));
        }
        t4.a.b(context).c(this, new IntentFilter(f1.a("6305235B8C007068AA3272")));
    }

    public void b(Context context) {
        if (context != null) {
            t4.a.b(context).e(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra(f1.a("7E0A294796076E75A5"))) {
            return;
        }
        String stringExtra = intent.getStringExtra(f1.b(f1.c("7E0A294796076E75A5")));
        if (context != null) {
            byte b10 = -1;
            switch (stringExtra.hashCode()) {
                case -1367123171:
                    if (s6.e.a("5826097DBA204E558D1B537D227E0937EC", stringExtra)) {
                        b10 = 7;
                    }
                    break;
                case -1226736817:
                    if (s6.e.a("53211961AA266D488A10545A36", stringExtra)) {
                        b10 = 6;
                    }
                    break;
                case -881046147:
                    if (s6.e.a("43250278AC31", stringExtra)) {
                        b10 = 3;
                    }
                    break;
                case -328950239:
                    if (s6.e.a("47251C7BAA2C4B44BB075840", stringExtra)) {
                        b10 = 8;
                    }
                    break;
                case 3506402:
                    if (s6.e.a("452B007C", stringExtra)) {
                        b10 = 0;
                    }
                    break;
                case 95458899:
                    if (s6.e.a("53210D7DAE", stringExtra)) {
                        b10 = 1;
                    }
                    break;
                case 99463088:
                    if (s6.e.a("5F2B0063BA", stringExtra)) {
                        b10 = 5;
                    }
                    break;
                case 639597323:
                    if (s6.e.a("7F13306AA8204444802B5651287E083DED07", stringExtra)) {
                        b10 = 9;
                    }
                    break;
                case 834063317:
                    if (s6.e.a("5A25037FA8314A", stringExtra)) {
                        b10 = 13;
                    }
                    break;
                case 1107986850:
                    if (s6.e.a("56200D4DA7224D4D8110", stringExtra)) {
                        b10 = 11;
                    }
                    break;
                case 1129117765:
                    if (s6.e.a("443D1C7CAC2E7971AA", stringExtra)) {
                        b10 = 12;
                    }
                    break;
                case 1336193813:
                    if (s6.e.a("52291A64A8374053", stringExtra)) {
                        b10 = 2;
                    }
                    break;
                case 1556684755:
                    if (s6.e.a("422A1B7ABC305B44803D5347256C103EFE16434072233D7D42BA7E", stringExtra)) {
                        b10 = 4;
                    }
                    break;
                case 1558978392:
                    if (s6.e.a("53211945A6274A", stringExtra)) {
                        b10 = 10;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    this.f21292a.k();
                    break;
                case 1:
                    this.f21292a.f();
                    break;
                case 2:
                    this.f21292a.l();
                    break;
                case 3:
                    this.f21292a.i();
                    break;
                case 4:
                    this.f21292a.h();
                    break;
                case 5:
                    this.f21292a.g();
                    break;
                case 6:
                    this.f21292a.n();
                    break;
                case 7:
                    this.f21292a.j();
                    break;
                case 8:
                    a aVar = this.f21293b;
                    if (aVar != null) {
                        aVar.c();
                    }
                    break;
                case 9:
                    a aVar2 = this.f21293b;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    break;
                case 10:
                    a aVar3 = this.f21293b;
                    if (aVar3 != null) {
                        aVar3.e();
                    }
                    break;
                case 11:
                    a aVar4 = this.f21293b;
                    if (aVar4 != null) {
                        aVar4.d();
                    }
                    break;
                case 12:
                    a aVar5 = this.f21293b;
                    if (aVar5 != null) {
                        aVar5.m();
                    }
                    break;
                case 13:
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f1.b(f1.c("7A05235F88116A7EAD3A7B7B")));
                    if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                        this.f21292a.a(parcelableArrayListExtra);
                        break;
                    }
                    break;
            }
        }
    }
}
