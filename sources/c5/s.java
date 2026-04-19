package c5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f6535b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f6534a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<l> f6536c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f6535b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6535b == sVar.f6535b && this.f6534a.equals(sVar.f6534a);
    }

    public int hashCode() {
        return (this.f6535b.hashCode() * 31) + this.f6534a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6535b + "\n") + "    values:";
        for (String str2 : this.f6534a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6534a.get(str2) + "\n";
        }
        return str;
    }
}
