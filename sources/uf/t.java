package uf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    private static class b implements Iterable<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f21822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f21823b;

        private b(s sVar, s sVar2) {
            this.f21822a = sVar;
            this.f21823b = sVar2;
        }

        @Override // java.lang.Iterable
        public Iterator<s> iterator() {
            return new c(this.f21822a, this.f21823b);
        }
    }

    private static class c implements Iterator<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f21824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f21825b;

        private c(s sVar, s sVar2) {
            this.f21824a = sVar;
            this.f21825b = sVar2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s next() {
            s sVar = this.f21824a;
            this.f21824a = sVar.e();
            return sVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            s sVar = this.f21824a;
            return (sVar == null || sVar == this.f21825b) ? false : true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public static Iterable<s> a(s sVar, s sVar2) {
        return new b(sVar.e(), sVar2);
    }
}
