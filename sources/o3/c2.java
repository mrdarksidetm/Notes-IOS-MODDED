package o3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    public static final class a implements ie.g<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16306a;

        a(ViewGroup viewGroup) {
            this.f16306a = viewGroup;
        }

        @Override // ie.g
        public Iterator<View> iterator() {
            return c2.b(this.f16306a);
        }
    }

    public static final class b implements Iterator<View>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16308b;

        b(ViewGroup viewGroup) {
            this.f16308b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f16308b;
            int i10 = this.f16307a;
            this.f16307a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16307a < this.f16308b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f16308b;
            int i10 = this.f16307a - 1;
            this.f16307a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final ie.g<View> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
