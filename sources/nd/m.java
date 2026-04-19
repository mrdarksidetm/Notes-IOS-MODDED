package nd;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
class m {
    public static final <T> T[] a(T[] tArr, int i10) {
        ae.r.f(tArr, "reference");
        Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        ae.r.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
