package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f3992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f3993b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f4000i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f4002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f4003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f4004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f4005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f4006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f4007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<String> f4008q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f4010s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f3994c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f4001j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f4009r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        n f4012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        g.b f4018h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        g.b f4019i;

        a() {
        }

        a(int i10, n nVar) {
            this.f4011a = i10;
            this.f4012b = nVar;
            this.f4013c = false;
            g.b bVar = g.b.RESUMED;
            this.f4018h = bVar;
            this.f4019i = bVar;
        }

        a(int i10, n nVar, boolean z10) {
            this.f4011a = i10;
            this.f4012b = nVar;
            this.f4013c = z10;
            g.b bVar = g.b.RESUMED;
            this.f4018h = bVar;
            this.f4019i = bVar;
        }
    }

    d0(s sVar, ClassLoader classLoader) {
        this.f3992a = sVar;
        this.f3993b = classLoader;
    }

    public d0 b(int i10, n nVar, String str) {
        k(i10, nVar, str, 1);
        return this;
    }

    d0 c(ViewGroup viewGroup, n nVar, String str) {
        nVar.mContainer = viewGroup;
        return b(viewGroup.getId(), nVar, str);
    }

    public d0 d(n nVar, String str) {
        k(0, nVar, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f3994c.add(aVar);
        aVar.f4014d = this.f3995d;
        aVar.f4015e = this.f3996e;
        aVar.f4016f = this.f3997f;
        aVar.f4017g = this.f3998g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public d0 j() {
        if (this.f4000i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4001j = false;
        return this;
    }

    void k(int i10, n nVar, String str, int i11) {
        String str2 = nVar.mPreviousWho;
        if (str2 != null) {
            l4.d.h(nVar, str2);
        }
        Class<?> cls = nVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = nVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + nVar + ": was " + nVar.mTag + " now " + str);
            }
            nVar.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + nVar + " with tag " + str + " to container view with no id");
            }
            int i12 = nVar.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + nVar + ": was " + nVar.mFragmentId + " now " + i10);
            }
            nVar.mFragmentId = i10;
            nVar.mContainerId = i10;
        }
        e(new a(i11, nVar));
    }

    public d0 l(n nVar) {
        e(new a(3, nVar));
        return this;
    }

    public d0 m(boolean z10) {
        this.f4009r = z10;
        return this;
    }
}
