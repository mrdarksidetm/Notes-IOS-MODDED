package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: classes.dex */
public class b extends k.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AlertController f956f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f958b;

        public a(Context context) {
            this(context, b.j(context, 0));
        }

        public a(Context context, int i10) {
            this.f957a = new AlertController.b(new ContextThemeWrapper(context, b.j(context, i10)));
            this.f958b = i10;
        }

        public b a() {
            b bVar = new b(this.f957a.f916a, this.f958b);
            this.f957a.a(bVar.f956f);
            bVar.setCancelable(this.f957a.f933r);
            if (this.f957a.f933r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f957a.f934s);
            bVar.setOnDismissListener(this.f957a.f935t);
            DialogInterface.OnKeyListener onKeyListener = this.f957a.f936u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f957a.f916a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f957a;
            bVar.f938w = listAdapter;
            bVar.f939x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f957a.f922g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f957a.f919d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f957a.f923h = charSequence;
            return this;
        }

        public a g(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f957a;
            bVar.f927l = bVar.f916a.getText(i10);
            this.f957a.f929n = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f957a;
            bVar.f927l = charSequence;
            bVar.f929n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnCancelListener onCancelListener) {
            this.f957a.f934s = onCancelListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f957a.f936u = onKeyListener;
            return this;
        }

        public a k(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f957a;
            bVar.f924i = bVar.f916a.getText(i10);
            this.f957a.f926k = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f957a;
            bVar.f924i = charSequence;
            bVar.f926k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f957a;
            bVar.f938w = listAdapter;
            bVar.f939x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a n(CharSequence charSequence) {
            this.f957a.f921f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i10) {
        super(context, j(context, i10));
        this.f956f = new AlertController(getContext(), this, getWindow());
    }

    static int j(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(j.a.f13345o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView i() {
        return this.f956f.d();
    }

    public void k(View view) {
        this.f956f.r(view);
    }

    @Override // k.e, e.m, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f956f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f956f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f956f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // k.e, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f956f.p(charSequence);
    }
}
