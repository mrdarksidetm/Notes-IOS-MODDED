package n3;

import android.util.LongSparseArray;
import nd.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a extends m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f15912b;

        a(LongSparseArray<T> longSparseArray) {
            this.f15912b = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15911a < this.f15912b.size();
        }

        @Override // nd.m0
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f15912b;
            int i10 = this.f15911a;
            this.f15911a = i10 + 1;
            return longSparseArray.keyAt(i10);
        }
    }

    public static final <T> m0 a(LongSparseArray<T> longSparseArray) {
        return new a(longSparseArray);
    }
}
