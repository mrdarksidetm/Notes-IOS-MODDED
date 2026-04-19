package nd;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @sd.d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle, R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlNormal, R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
    static final class a<T> extends sd.i implements zd.p<ie.i<? super List<? extends T>>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f16089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f16091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f16092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f16093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f16094h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f16095i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f16096j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f16092f = i10;
            this.f16093g = i11;
            this.f16094h = it;
            this.f16095i = z10;
            this.f16096j = z11;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ie.i<? super List<? extends T>> iVar, qd.d<? super md.i0> dVar) {
            return ((a) create(iVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f16092f, this.f16093g, this.f16094h, this.f16095i, this.f16096j, dVar);
            aVar.f16091e = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011c -> B:58:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014a -> B:71:0x014d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: nd.a1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        ae.r.f(it, "iterator");
        return !it.hasNext() ? d0.f16116a : ie.k.a(new a(i10, i11, it, z11, z10, null));
    }
}
