package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class u extends c<Float> implements y.f, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f3743d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f3744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3745c;

    static {
        u uVar = new u(new float[0], 0);
        f3743d = uVar;
        uVar.e();
    }

    u() {
        this(new float[10], 0);
    }

    private u(float[] fArr, int i10) {
        this.f3744b = fArr;
        this.f3745c = i10;
    }

    private void k(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f3745c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        float[] fArr = this.f3744b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f3744b, i10, fArr2, i10 + 1, this.f3745c - i10);
            this.f3744b = fArr2;
        }
        this.f3744b[i10] = f10;
        this.f3745c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f3745c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3745c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f3745c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3745c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f3744b;
        if (i12 > fArr.length) {
            this.f3744b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(uVar.f3744b, 0, this.f3744b, this.f3745c, uVar.f3745c);
        this.f3745c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        k(i10, f10.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        f(f10.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f3745c != uVar.f3745c) {
            return false;
        }
        float[] fArr = uVar.f3744b;
        for (int i10 = 0; i10 < this.f3745c; i10++) {
            if (Float.floatToIntBits(this.f3744b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(float f10) {
        a();
        int i10 = this.f3745c;
        float[] fArr = this.f3744b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f3744b = fArr2;
        }
        float[] fArr3 = this.f3744b;
        int i11 = this.f3745c;
        this.f3745c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f3745c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f3744b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(o(i10));
    }

    public float o(int i10) {
        l(i10);
        return this.f3744b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f3745c; i10++) {
            if (obj.equals(Float.valueOf(this.f3744b[i10]))) {
                float[] fArr = this.f3744b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f3745c - i10) - 1);
                this.f3745c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f3744b;
        System.arraycopy(fArr, i11, fArr, i10, this.f3745c - i11);
        this.f3745c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public y.f g(int i10) {
        if (i10 >= this.f3745c) {
            return new u(Arrays.copyOf(this.f3744b, i10), this.f3745c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3745c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        l(i10);
        float[] fArr = this.f3744b;
        float f10 = fArr[i10];
        if (i10 < this.f3745c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f3745c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(v(i10, f10.floatValue()));
    }

    public float v(int i10, float f10) {
        a();
        l(i10);
        float[] fArr = this.f3744b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }
}
