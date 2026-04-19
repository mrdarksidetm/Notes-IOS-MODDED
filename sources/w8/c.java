package w8;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f22599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f22600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f22601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f22602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f22604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o9.a f22607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f22608j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f22609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z.b f22610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f22612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o9.a f22613e = o9.a.f16415j;

        public c a() {
            return new c(this.f22609a, this.f22610b, null, 0, null, this.f22611c, this.f22612d, this.f22613e, false);
        }

        public a b(String str) {
            this.f22611c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f22610b == null) {
                this.f22610b = new z.b();
            }
            this.f22610b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f22609a = account;
            return this;
        }

        public final a e(String str) {
            this.f22612d = str;
            return this;
        }
    }

    public c(Account account, Set set, Map map, int i10, View view, String str, String str2, o9.a aVar, boolean z10) {
        this.f22599a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f22600b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f22602d = map;
        this.f22604f = view;
        this.f22603e = i10;
        this.f22605g = str;
        this.f22606h = str2;
        this.f22607i = aVar == null ? o9.a.f16415j : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((y) it.next()).f22672a);
        }
        this.f22601c = Collections.unmodifiableSet(hashSet);
    }

    public static c a(Context context) {
        return new e.a(context).a();
    }

    public Account b() {
        return this.f22599a;
    }

    @Deprecated
    public String c() {
        Account account = this.f22599a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account d() {
        Account account = this.f22599a;
        return account != null ? account : new Account(com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT, "com.google");
    }

    public Set<Scope> e() {
        return this.f22601c;
    }

    public Set<Scope> f(com.google.android.gms.common.api.a<?> aVar) {
        y yVar = (y) this.f22602d.get(aVar);
        if (yVar == null || yVar.f22672a.isEmpty()) {
            return this.f22600b;
        }
        HashSet hashSet = new HashSet(this.f22600b);
        hashSet.addAll(yVar.f22672a);
        return hashSet;
    }

    public String g() {
        return this.f22605g;
    }

    public Set<Scope> h() {
        return this.f22600b;
    }

    public final o9.a i() {
        return this.f22607i;
    }

    public final Integer j() {
        return this.f22608j;
    }

    public final String k() {
        return this.f22606h;
    }

    public final void l(Integer num) {
        this.f22608j = num;
    }
}
