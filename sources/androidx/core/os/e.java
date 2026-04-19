package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f3331a;

    e(Object obj) {
        this.f3331a = (LocaleList) obj;
    }

    @Override // androidx.core.os.d
    public String a() {
        return this.f3331a.toLanguageTags();
    }

    @Override // androidx.core.os.d
    public Object b() {
        return this.f3331a;
    }

    public boolean equals(Object obj) {
        return this.f3331a.equals(((d) obj).b());
    }

    @Override // androidx.core.os.d
    public Locale get(int i10) {
        return this.f3331a.get(i10);
    }

    public int hashCode() {
        return this.f3331a.hashCode();
    }

    @Override // androidx.core.os.d
    public boolean isEmpty() {
        return this.f3331a.isEmpty();
    }

    @Override // androidx.core.os.d
    public int size() {
        return this.f3331a.size();
    }

    public String toString() {
        return this.f3331a.toString();
    }
}
