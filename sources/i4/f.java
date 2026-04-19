package i4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f12506a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f12507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f12508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12509c = true;

        a(TextView textView) {
            this.f12507a = textView;
            this.f12508b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f12508b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f12508b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f12507a.setFilters(a(this.f12507a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // i4.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f12509c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // i4.f.b
        public boolean b() {
            return this.f12509c;
        }

        @Override // i4.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // i4.f.b
        void d(boolean z10) {
            this.f12509c = z10;
            l();
            k();
        }

        @Override // i4.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f12509c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f12509c = z10;
        }

        void l() {
            this.f12507a.setTransformationMethod(e(this.f12507a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }

        void d(boolean z10) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f12510a;

        c(TextView textView) {
            this.f12510a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.i();
        }

        @Override // i4.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f12510a.a(inputFilterArr);
        }

        @Override // i4.f.b
        public boolean b() {
            return this.f12510a.b();
        }

        @Override // i4.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f12510a.c(z10);
        }

        @Override // i4.f.b
        void d(boolean z10) {
            if (f()) {
                this.f12510a.i(z10);
            } else {
                this.f12510a.d(z10);
            }
        }

        @Override // i4.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f12510a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        n3.g.i(textView, "textView cannot be null");
        this.f12506a = !z10 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f12506a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f12506a.b();
    }

    public void c(boolean z10) {
        this.f12506a.c(z10);
    }

    public void d(boolean z10) {
        this.f12506a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f12506a.e(transformationMethod);
    }
}
