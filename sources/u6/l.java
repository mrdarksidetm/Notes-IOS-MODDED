package u6;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import s6.f1;
import u6.d;
import u6.f;

/* JADX INFO: loaded from: classes.dex */
public class l implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21732d = f1.a("6305235B8C007068AA3272");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f21733e = f1.b(f1.c("7E0A294796076E75A5"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.a f21734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.c f21735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f21736c;

    public l(Context context, d.c cVar, f.b bVar) {
        this.f21734a = t4.a.b(context);
        this.f21735b = cVar;
        this.f21736c = bVar;
    }

    @Override // u6.k
    public d.c a() {
        return this.f21735b;
    }

    @Override // u6.k
    public void a(Integer num) {
    }

    @Override // u6.k
    public f.b b() {
        return this.f21736c;
    }

    @Override // u6.k
    public void b(String str, ArrayList<t6.b> arrayList) {
        e(str, arrayList);
    }

    @Override // u6.k
    public void c(Integer num, String str) {
        if (num == null) {
            d(str);
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                d(str);
            } else {
                f1.a("51360A6D9B027C71");
                f1.b(f1.c("622A0466A634410196115C572564133CBF16535F795E"));
            }
        }
    }

    public final void d(String str) {
        Intent intent = new Intent(f1.a("6305235B8C007068AA3272"));
        intent.putExtra(f1.b(f1.c("7E0A294796076E75A5")), str);
        this.f21734a.d(intent);
    }

    public final void e(String str, ArrayList<t6.b> arrayList) {
        Intent intent = new Intent(f1.a("6305235B8C007068AA3272"));
        intent.putExtra(f1.b(f1.c("7E0A294796076E75A5")), str);
        intent.putParcelableArrayListExtra(f1.b(f1.c("7A05235F88116A7EAD3A7B7B")), arrayList);
        this.f21734a.d(intent);
    }
}
