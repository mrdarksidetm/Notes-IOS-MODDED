package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends f0 implements p.c {
    static final o E0;
    private Rect A;
    private final TextView.OnEditorActionListener A0;
    private int[] B;
    private final AdapterView.OnItemClickListener B0;
    private int[] C;
    private final AdapterView.OnItemSelectedListener C0;
    private final ImageView D;
    private TextWatcher D0;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final CharSequence f1412a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private m f1413b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private l f1414c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    View.OnFocusChangeListener f1415d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private n f1416e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private View.OnClickListener f1417f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f1418g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f1419h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    w3.a f1420i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f1421j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private CharSequence f1422k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f1423l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f1424m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f1425n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f1426o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f1427p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private CharSequence f1428p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f1429q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private CharSequence f1430q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f1431r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f1432r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f1433s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f1434s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ImageView f1435t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    SearchableInfo f1436t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f1437u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private Bundle f1438u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f1439v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final Runnable f1440v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f1441w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Runnable f1442w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f1443x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1444x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private q f1445y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final View.OnClickListener f1446y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f1447z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    View.OnKeyListener f1448z0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f1450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f1452h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, j.a.f13346p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1452h = new a();
            this.f1449e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.E0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f1451g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1451g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1449e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1451g) {
                removeCallbacks(this.f1452h);
                post(this.f1452h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1450f.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1450f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1450f.hasFocus() && getVisibility() == 0) {
                this.f1451g = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1451g = false;
                removeCallbacks(this.f1452h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1451g = true;
                    return;
                }
                this.f1451g = false;
                removeCallbacks(this.f1452h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1450f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1449e = i10;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.U(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w3.a aVar = SearchView.this.f1420i0;
            if (aVar instanceof m0) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1415d0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.x();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1435t) {
                searchView.R();
                return;
            }
            if (view == searchView.f1439v) {
                searchView.N();
                return;
            }
            if (view == searchView.f1437u) {
                searchView.S();
            } else if (view == searchView.f1441w) {
                searchView.W();
            } else if (view == searchView.f1427p) {
                searchView.D();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1436t0 == null) {
                return false;
            }
            if (searchView.f1427p.isPopupShowing() && SearchView.this.f1427p.getListSelection() != -1) {
                return SearchView.this.T(view, i10, keyEvent);
            }
            if (SearchView.this.f1427p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.f1427p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.O(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.P(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
        boolean onSuggestionClick(int i10);

        boolean onSuggestionSelect(int i10);
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f1464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f1465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f1466c;

        o() {
            this.f1464a = null;
            this.f1465b = null;
            this.f1466c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1464a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1465b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1466c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1465b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1464a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1466c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends y3.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1467c;

        class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1467c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1467c + "}";
        }

        @Override // y3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1467c));
        }
    }

    private static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f1468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f1469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f1470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f1471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1473f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1472e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1469b = new Rect();
            this.f1471d = new Rect();
            this.f1470c = new Rect();
            a(rect, rect2);
            this.f1468a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1469b.set(rect);
            this.f1471d.set(rect);
            Rect rect3 = this.f1471d;
            int i10 = this.f1472e;
            rect3.inset(-i10, -i10);
            this.f1470c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float width;
            int height;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1473f;
                    if (z11 && !this.f1471d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1473f;
                        this.f1473f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1469b.contains(x10, y10)) {
                this.f1473f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1470c.contains(x10, y10)) {
                Rect rect = this.f1470c;
                width = x10 - rect.left;
                height = y10 - rect.top;
            } else {
                width = this.f1468a.getWidth() / 2;
                height = this.f1468a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f1468a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        E0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1447z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1440v0 = new b();
        this.f1442w0 = new c();
        this.f1444x0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1446y0 = fVar;
        this.f1448z0 = new g();
        h hVar = new h();
        this.A0 = hVar;
        i iVar = new i();
        this.B0 = iVar;
        j jVar = new j();
        this.C0 = jVar;
        this.D0 = new a();
        int[] iArr = j.j.f13500f2;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        androidx.core.view.h.U(this, context, iArr, attributeSet, r0VarU.q(), i10, 0);
        LayoutInflater.from(context).inflate(r0VarU.m(j.j.f13550p2, j.g.f13450r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(j.f.D);
        this.f1427p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1429q = findViewById(j.f.f13432z);
        View viewFindViewById = findViewById(j.f.C);
        this.f1431r = viewFindViewById;
        View viewFindViewById2 = findViewById(j.f.J);
        this.f1433s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(j.f.f13430x);
        this.f1435t = imageView;
        ImageView imageView2 = (ImageView) findViewById(j.f.A);
        this.f1437u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(j.f.f13431y);
        this.f1439v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(j.f.E);
        this.f1441w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(j.f.B);
        this.D = imageView5;
        androidx.core.view.h.Z(viewFindViewById, r0VarU.f(j.j.f13555q2));
        androidx.core.view.h.Z(viewFindViewById2, r0VarU.f(j.j.f13575u2));
        int i11 = j.j.f13570t2;
        imageView.setImageDrawable(r0VarU.f(i11));
        imageView2.setImageDrawable(r0VarU.f(j.j.f13540n2));
        imageView3.setImageDrawable(r0VarU.f(j.j.f13525k2));
        imageView4.setImageDrawable(r0VarU.f(j.j.f13585w2));
        imageView5.setImageDrawable(r0VarU.f(i11));
        this.E = r0VarU.f(j.j.f13565s2);
        t0.a(imageView, getResources().getString(j.h.f13466n));
        this.F = r0VarU.m(j.j.f13580v2, j.g.f13449q);
        this.G = r0VarU.m(j.j.f13530l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.D0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1448z0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(r0VarU.a(j.j.f13545o2, true));
        int iE = r0VarU.e(j.j.f13510h2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.f1412a0 = r0VarU.o(j.j.f13535m2);
        this.f1422k0 = r0VarU.o(j.j.f13560r2);
        int iJ = r0VarU.j(j.j.f13520j2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = r0VarU.j(j.j.f13515i2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(r0VarU.a(j.j.f13505g2, true));
        r0VarU.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1443x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.f1418g0);
        c0();
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1438u0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.f1427p.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.f1418g0 || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1427p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.f1436t0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1436t0.getVoiceSearchLaunchWebSearch()) {
            intent = this.H;
        } else if (this.f1436t0.getVoiceSearchLaunchRecognizer()) {
            intent = this.I;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.f1421j0 || this.f1426o0) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean M(int i10, int i11, String str) {
        Cursor cursorB = this.f1420i0.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        K(z(cursorB, i11, str));
        return true;
    }

    private void X() {
        post(this.f1440v0);
    }

    private void Y(int i10) {
        CharSequence charSequenceConvertToString;
        Editable text = this.f1427p.getText();
        Cursor cursorB = this.f1420i0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10) || (charSequenceConvertToString = this.f1420i0.convertToString(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceConvertToString);
        }
    }

    private void a0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1427p.getText());
        if (!z11 && (!this.f1418g0 || this.f1432r0)) {
            z10 = false;
        }
        this.f1439v.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f1439v.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1427p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.f1427p.setThreshold(this.f1436t0.getSuggestThreshold());
        this.f1427p.setImeOptions(this.f1436t0.getImeOptions());
        int inputType = this.f1436t0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1436t0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1427p.setInputType(inputType);
        w3.a aVar = this.f1420i0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1436t0.getSuggestAuthority() != null) {
            m0 m0Var = new m0(getContext(), this, this.f1436t0, this.f1444x0);
            this.f1420i0 = m0Var;
            this.f1427p.setAdapter(m0Var);
            ((m0) this.f1420i0).w(this.f1423l0 ? 2 : 1);
        }
    }

    private void e0() {
        this.f1433s.setVisibility((J() && (this.f1437u.getVisibility() == 0 || this.f1441w.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z10) {
        this.f1437u.setVisibility((this.f1421j0 && J() && hasFocus() && (z10 || !this.f1426o0)) ? 0 : 8);
    }

    private void g0(boolean z10) {
        this.f1419h0 = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1427p.getText());
        this.f1435t.setVisibility(i10);
        f0(z11);
        this.f1429q.setVisibility(z10 ? 8 : 0);
        this.D.setVisibility((this.D.getDrawable() == null || this.f1418g0) ? 8 : 0);
        a0();
        h0(!z11);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(j.d.f13372g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(j.d.f13373h);
    }

    private void h0(boolean z10) {
        int i10 = 8;
        if (this.f1426o0 && !H() && z10) {
            this.f1437u.setVisibility(8);
            i10 = 0;
        }
        this.f1441w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1427p.setText(charSequence);
        this.f1427p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1430q0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1438u0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1436t0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = m0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f1436t0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = m0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f1436t0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = m0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return y(str2, strN3 == null ? null : Uri.parse(strN3), m0.n(cursor, "suggest_intent_extra_data"), m0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1427p);
            return;
        }
        o oVar = E0;
        oVar.b(this.f1427p);
        oVar.a(this.f1427p);
    }

    public boolean H() {
        return this.f1419h0;
    }

    void L(int i10, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.f1427p.getText())) {
            this.f1427p.setText("");
            this.f1427p.requestFocus();
            this.f1427p.setImeVisibility(true);
        } else if (this.f1418g0) {
            l lVar = this.f1414c0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                g0(true);
            }
        }
    }

    boolean O(int i10, int i11, String str) {
        n nVar = this.f1416e0;
        if (nVar != null && nVar.onSuggestionClick(i10)) {
            return false;
        }
        M(i10, 0, null);
        this.f1427p.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i10) {
        n nVar = this.f1416e0;
        if (nVar != null && nVar.onSuggestionSelect(i10)) {
            return false;
        }
        Y(i10);
        return true;
    }

    protected void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.f1427p.requestFocus();
        this.f1427p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1417f0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.f1427p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f1413b0;
        if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
            if (this.f1436t0 != null) {
                L(0, null, text.toString());
            }
            this.f1427p.setImeVisibility(false);
            C();
        }
    }

    boolean T(View view, int i10, KeyEvent keyEvent) {
        if (this.f1436t0 != null && this.f1420i0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return O(this.f1427p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1427p.setSelection(i10 == 21 ? 0 : this.f1427p.length());
                this.f1427p.setListSelection(0);
                this.f1427p.clearListSelection();
                this.f1427p.b();
                return true;
            }
            if (i10 == 19) {
                this.f1427p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.f1427p.getText();
        this.f1430q0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        f0(z10);
        h0(!z10);
        a0();
        e0();
        if (this.f1413b0 != null && !TextUtils.equals(charSequence, this.f1428p0)) {
            this.f1413b0.onQueryTextChange(charSequence.toString());
        }
        this.f1428p0 = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.f1427p.hasFocus()) {
            D();
        }
    }

    void W() {
        Intent intentA;
        SearchableInfo searchableInfo = this.f1436t0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentA = B(this.H, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentA = A(this.I, searchableInfo);
            }
            getContext().startActivity(intentA);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z10) {
        this.f1427p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1427p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1430q0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.f1427p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1431r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1433s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1424m0 = true;
        super.clearFocus();
        this.f1427p.clearFocus();
        this.f1427p.setImeVisibility(false);
        this.f1424m0 = false;
    }

    public int getImeOptions() {
        return this.f1427p.getImeOptions();
    }

    public int getInputType() {
        return this.f1427p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1425n0;
    }

    public CharSequence getQuery() {
        return this.f1427p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1422k0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1436t0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1412a0 : getContext().getText(this.f1436t0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.G;
    }

    int getSuggestionRowLayout() {
        return this.F;
    }

    public w3.a getSuggestionsAdapter() {
        return this.f1420i0;
    }

    @Override // p.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.f1427p.setImeOptions(this.f1434s0);
        this.f1432r0 = false;
    }

    @Override // p.c
    public void onActionViewExpanded() {
        if (this.f1432r0) {
            return;
        }
        this.f1432r0 = true;
        int imeOptions = this.f1427p.getImeOptions();
        this.f1434s0 = imeOptions;
        this.f1427p.setImeOptions(imeOptions | 33554432);
        this.f1427p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1440v0);
        post(this.f1442w0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.f0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E(this.f1427p, this.f1447z);
            Rect rect = this.A;
            Rect rect2 = this.f1447z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f1445y;
            if (qVar != null) {
                qVar.a(this.A, this.f1447z);
                return;
            }
            q qVar2 = new q(this.A, this.f1447z, this.f1427p);
            this.f1445y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.f0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.H()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f1425n0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f1425n0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f1425n0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        g0(pVar.f1467c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1467c = H();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1424m0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f1427p.requestFocus(i10, rect);
        if (zRequestFocus) {
            g0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1438u0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1418g0 == z10) {
            return;
        }
        this.f1418g0 = z10;
        g0(z10);
        c0();
    }

    public void setImeOptions(int i10) {
        this.f1427p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1427p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1425n0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f1414c0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1415d0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f1413b0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1417f0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f1416e0 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1422k0 = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1423l0 = z10;
        w3.a aVar = this.f1420i0;
        if (aVar instanceof m0) {
            ((m0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1436t0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean zG = G();
        this.f1426o0 = zG;
        if (zG) {
            this.f1427p.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1421j0 = z10;
        g0(H());
    }

    public void setSuggestionsAdapter(w3.a aVar) {
        this.f1420i0 = aVar;
        this.f1427p.setAdapter(aVar);
    }

    void x() {
        if (this.f1443x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1431r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = z0.b(this);
            int dimensionPixelSize = this.f1418g0 ? resources.getDimensionPixelSize(j.d.f13370e) + resources.getDimensionPixelSize(j.d.f13371f) : 0;
            this.f1427p.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f1427p.setDropDownHorizontalOffset(zB ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f1427p.setDropDownWidth((((this.f1443x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
