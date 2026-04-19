package q2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import r2.r;
import r2.s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LocaleList f18969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f18970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f18971c = r.a();

    @Override // q2.g
    public e b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f18971c) {
            e eVar = this.f18970b;
            if (eVar != null && localeList == this.f18969a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(new a(localeList.get(i10))));
            }
            e eVar2 = new e(arrayList);
            this.f18969a = localeList;
            this.f18970b = eVar2;
            return eVar2;
        }
    }

    @Override // q2.g
    public f c(String str) {
        return new a(Locale.forLanguageTag(str));
    }
}
