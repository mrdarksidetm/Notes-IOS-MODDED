package w6;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sc.j;
import w6.a;
import w6.q;
import w6.u;

/* JADX INFO: loaded from: classes.dex */
final class l implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f22492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f22493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f22494d;

    l(Context context, a aVar, q qVar, u uVar) {
        this.f22491a = context;
        this.f22492b = aVar;
        this.f22493c = qVar;
        this.f22494d = uVar;
    }

    @Override // sc.j.c
    public void onMethodCall(sc.i iVar, final j.d dVar) {
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "checkServiceStatus":
                int i10 = Integer.parseInt(iVar.f20504b.toString());
                u uVar = this.f22494d;
                Context context = this.f22491a;
                Objects.requireNonNull(dVar);
                uVar.a(i10, context, new u.a() { // from class: w6.c
                    @Override // w6.u.a
                    public final void a(int i11) {
                        dVar.success(Integer.valueOf(i11));
                    }
                }, new b() { // from class: w6.d
                    @Override // w6.b
                    public final void a(String str2, String str3) {
                        dVar.error(str2, str3, null);
                    }
                });
                break;
            case "shouldShowRequestPermissionRationale":
                int i11 = Integer.parseInt(iVar.f20504b.toString());
                q qVar = this.f22493c;
                Objects.requireNonNull(dVar);
                qVar.j(i11, new q.c() { // from class: w6.h
                    @Override // w6.q.c
                    public final void a(boolean z10) {
                        dVar.success(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: w6.i
                    @Override // w6.b
                    public final void a(String str2, String str3) {
                        dVar.error(str2, str3, null);
                    }
                });
                break;
            case "checkPermissionStatus":
                int i12 = Integer.parseInt(iVar.f20504b.toString());
                q qVar2 = this.f22493c;
                Objects.requireNonNull(dVar);
                qVar2.c(i12, new q.a() { // from class: w6.e
                    @Override // w6.q.a
                    public final void a(int i13) {
                        dVar.success(Integer.valueOf(i13));
                    }
                });
                break;
            case "openAppSettings":
                a aVar = this.f22492b;
                Context context2 = this.f22491a;
                Objects.requireNonNull(dVar);
                aVar.a(context2, new a.InterfaceC0469a() { // from class: w6.j
                    @Override // w6.a.InterfaceC0469a
                    public final void a(boolean z10) {
                        dVar.success(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: w6.k
                    @Override // w6.b
                    public final void a(String str2, String str3) {
                        dVar.error(str2, str3, null);
                    }
                });
                break;
            case "requestPermissions":
                List<Integer> list = (List) iVar.b();
                q qVar3 = this.f22493c;
                Objects.requireNonNull(dVar);
                qVar3.h(list, new q.b() { // from class: w6.f
                    @Override // w6.q.b
                    public final void a(Map map) {
                        dVar.success(map);
                    }
                }, new b() { // from class: w6.g
                    @Override // w6.b
                    public final void a(String str2, String str3) {
                        dVar.error(str2, str3, null);
                    }
                });
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
