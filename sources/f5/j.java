package f5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f11135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11136c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11137a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f11138b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11139c = 1;

        public a a(int... iArr) {
            for (int i10 : iArr) {
                this.f11137a = i10 | this.f11137a;
            }
            return this;
        }

        public a b(String... strArr) {
            this.f11138b.addAll(Arrays.asList(strArr));
            return this;
        }

        public j c() {
            return new j(this.f11137a, this.f11138b, this.f11139c);
        }

        public a d(int i10) {
            this.f11139c = i10;
            return this;
        }
    }

    public j(int i10, List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f11135b = arrayList;
        this.f11134a = i10;
        arrayList.addAll(list);
        this.f11136c = i11;
    }

    public List<String> a() {
        return this.f11135b;
    }

    public int b() {
        return this.f11134a;
    }

    public int c() {
        return this.f11136c;
    }
}
