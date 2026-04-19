package z7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f24281c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f24283b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24284a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f24285b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f24284a, Collections.unmodifiableList(this.f24285b));
        }

        public a b(List<c> list) {
            this.f24285b = list;
            return this;
        }

        public a c(String str) {
            this.f24284a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f24282a = str;
        this.f24283b = list;
    }

    public static a c() {
        return new a();
    }

    public List<c> a() {
        return this.f24283b;
    }

    public String b() {
        return this.f24282a;
    }
}
