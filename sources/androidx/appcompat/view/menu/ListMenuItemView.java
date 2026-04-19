package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.r0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f1154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f1155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f1156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f1157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f1158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f1159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f1160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f1161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f1162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f1163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f1165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f1167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f1169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1170q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.D);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        r0 r0VarU = r0.u(getContext(), attributeSet, j.j.T1, i10, 0);
        this.f1163j = r0VarU.f(j.j.V1);
        this.f1164k = r0VarU.m(j.j.U1, -1);
        this.f1166m = r0VarU.a(j.j.W1, false);
        this.f1165l = context;
        this.f1167n = r0VarU.f(j.j.X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, j.a.A, 0);
        this.f1168o = typedArrayObtainStyledAttributes.hasValue(0);
        r0VarU.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f1162i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(j.g.f13440h, (ViewGroup) this, false);
        this.f1158e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(j.g.f13441i, (ViewGroup) this, false);
        this.f1155b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(j.g.f13443k, (ViewGroup) this, false);
        this.f1156c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1169p == null) {
            this.f1169p = LayoutInflater.from(getContext());
        }
        return this.f1169p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1160g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1161h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1161h.getLayoutParams();
        rect.top += this.f1161h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f1154a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f1154a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f1154a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f1159f.setText(this.f1154a.h());
        }
        if (this.f1159f.getVisibility() != i10) {
            this.f1159f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        androidx.core.view.h.Z(this, this.f1163j);
        TextView textView = (TextView) findViewById(j.f.M);
        this.f1157d = textView;
        int i10 = this.f1164k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1165l, i10);
        }
        this.f1159f = (TextView) findViewById(j.f.F);
        ImageView imageView = (ImageView) findViewById(j.f.I);
        this.f1160g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1167n);
        }
        this.f1161h = (ImageView) findViewById(j.f.f13424r);
        this.f1162i = (LinearLayout) findViewById(j.f.f13418l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1155b != null && this.f1166m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1155b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1156c == null && this.f1158e == null) {
            return;
        }
        if (this.f1154a.m()) {
            if (this.f1156c == null) {
                g();
            }
            compoundButton = this.f1156c;
            view = this.f1158e;
        } else {
            if (this.f1158e == null) {
                e();
            }
            compoundButton = this.f1158e;
            view = this.f1156c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1154a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1158e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1156c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1154a.m()) {
            if (this.f1156c == null) {
                g();
            }
            compoundButton = this.f1156c;
        } else {
            if (this.f1158e == null) {
                e();
            }
            compoundButton = this.f1158e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1170q = z10;
        this.f1166m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1161h;
        if (imageView != null) {
            imageView.setVisibility((this.f1168o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f1154a.z() || this.f1170q;
        if (z10 || this.f1166m) {
            ImageView imageView = this.f1155b;
            if (imageView == null && drawable == null && !this.f1166m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f1166m) {
                this.f1155b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1155b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1155b.getVisibility() != 0) {
                this.f1155b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f1157d.setText(charSequence);
            if (this.f1157d.getVisibility() == 0) {
                return;
            }
            textView = this.f1157d;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f1157d.getVisibility() == 8) {
                return;
            } else {
                textView = this.f1157d;
            }
        }
        textView.setVisibility(i10);
    }
}
