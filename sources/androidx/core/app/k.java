package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f3263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f3264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f3265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f3266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f3267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f3268f;

    static class a {
        static k a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(k kVar) {
            return new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public native /* synthetic */ Person build();

                public native /* synthetic */ Builder setBot(boolean z10);

                public native /* synthetic */ Builder setIcon(Icon icon);

                public native /* synthetic */ Builder setImportant(boolean z10);

                public native /* synthetic */ Builder setKey(String str);

                public native /* synthetic */ Builder setName(CharSequence charSequence);

                public native /* synthetic */ Builder setUri(String str);
            }.setName(kVar.c()).setIcon(kVar.a() != null ? kVar.a().q() : null).setUri(kVar.d()).setKey(kVar.b()).setBot(kVar.e()).setImportant(kVar.f()).build();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f3269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f3270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f3271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f3272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3274f;

        public k a() {
            return new k(this);
        }

        public b b(boolean z10) {
            this.f3273e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f3270b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f3274f = z10;
            return this;
        }

        public b e(String str) {
            this.f3272d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f3269a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f3271c = str;
            return this;
        }
    }

    k(b bVar) {
        this.f3263a = bVar.f3269a;
        this.f3264b = bVar.f3270b;
        this.f3265c = bVar.f3271c;
        this.f3266d = bVar.f3272d;
        this.f3267e = bVar.f3273e;
        this.f3268f = bVar.f3274f;
    }

    public IconCompat a() {
        return this.f3264b;
    }

    public String b() {
        return this.f3266d;
    }

    public CharSequence c() {
        return this.f3263a;
    }

    public String d() {
        return this.f3265c;
    }

    public boolean e() {
        return this.f3267e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        String strB = b();
        String strB2 = kVar.b();
        return (strB == null && strB2 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(kVar.c())) && Objects.equals(d(), kVar.d()) && Objects.equals(Boolean.valueOf(e()), Boolean.valueOf(kVar.e())) && Objects.equals(Boolean.valueOf(f()), Boolean.valueOf(kVar.f())) : Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f3268f;
    }

    public String g() {
        String str = this.f3265c;
        if (str != null) {
            return str;
        }
        if (this.f3263a == null) {
            return "";
        }
        return "name:" + ((Object) this.f3263a);
    }

    public Person h() {
        return a.b(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f3263a);
        IconCompat iconCompat = this.f3264b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.p() : null);
        bundle.putString("uri", this.f3265c);
        bundle.putString(SubscriberAttributeKt.JSON_NAME_KEY, this.f3266d);
        bundle.putBoolean("isBot", this.f3267e);
        bundle.putBoolean("isImportant", this.f3268f);
        return bundle;
    }
}
