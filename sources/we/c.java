package we;

import ae.r;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f22896a;

    public c(List<String> list, String str) {
        StringBuilder sb2;
        String str2;
        r.f(list, "missingFields");
        r.f(str, "serialName");
        if (list.size() == 1) {
            sb2 = new StringBuilder();
            sb2.append("Field '");
            sb2.append(list.get(0));
            sb2.append("' is required for type with serial name '");
            sb2.append(str);
            str2 = "', but it was missing";
        } else {
            sb2 = new StringBuilder();
            sb2.append("Fields ");
            sb2.append(list);
            sb2.append(" are required for type with serial name '");
            sb2.append(str);
            str2 = "', but they were missing";
        }
        sb2.append(str2);
        this(list, sb2.toString(), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<String> list, String str, Throwable th) {
        super(str, th);
        r.f(list, "missingFields");
        this.f22896a = list;
    }

    public final List<String> a() {
        return this.f22896a;
    }
}
