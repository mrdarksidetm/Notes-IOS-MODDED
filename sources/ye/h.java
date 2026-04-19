package ye;

import ae.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public static final class a implements Iterator<f>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24003b;

        a(f fVar) {
            this.f24003b = fVar;
            this.f24002a = fVar.f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f24003b;
            int iF = fVar.f();
            int i10 = this.f24002a;
            this.f24002a = i10 - 1;
            return fVar.i(iF - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24002a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator<String>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24005b;

        b(f fVar) {
            this.f24005b = fVar;
            this.f24004a = fVar.f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f24005b;
            int iF = fVar.f();
            int i10 = this.f24004a;
            this.f24004a = i10 - 1;
            return fVar.g(iF - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24004a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable<f>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24006a;

        public c(f fVar) {
            this.f24006a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f24006a);
        }
    }

    public static final class d implements Iterable<String>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24007a;

        public d(f fVar) {
            this.f24007a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f24007a);
        }
    }

    public static final Iterable<f> a(f fVar) {
        r.f(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable<String> b(f fVar) {
        r.f(fVar, "<this>");
        return new d(fVar);
    }
}
