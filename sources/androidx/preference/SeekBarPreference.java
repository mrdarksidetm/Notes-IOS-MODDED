package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import u4.c;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int G;
    int H;
    private int I;
    private int X;
    boolean Y;
    SeekBar Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextView f4470a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    boolean f4471b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f4472c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f4473d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f4474e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final View.OnKeyListener f4475f0;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f4473d0 || !seekBarPreference.Y) {
                    seekBarPreference.O(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.P(i10 + seekBarPreference2.H);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Y = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Y = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.H != seekBarPreference.G) {
                seekBarPreference.O(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f4471b0 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.Z;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f21623h);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4474e0 = new a();
        this.f4475f0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.C0, i10, i11);
        this.H = typedArrayObtainStyledAttributes.getInt(g.F0, 0);
        L(typedArrayObtainStyledAttributes.getInt(g.D0, 100));
        M(typedArrayObtainStyledAttributes.getInt(g.G0, 0));
        this.f4471b0 = typedArrayObtainStyledAttributes.getBoolean(g.E0, true);
        this.f4472c0 = typedArrayObtainStyledAttributes.getBoolean(g.H0, false);
        this.f4473d0 = typedArrayObtainStyledAttributes.getBoolean(g.I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void N(int i10, boolean z10) {
        int i11 = this.H;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.I;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.G) {
            this.G = i10;
            P(i10);
            G(i10);
            if (z10) {
                x();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public final void L(int i10) {
        int i11 = this.H;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.I) {
            this.I = i10;
            x();
        }
    }

    public final void M(int i10) {
        if (i10 != this.X) {
            this.X = Math.min(this.I - this.H, Math.abs(i10));
            x();
        }
    }

    void O(SeekBar seekBar) {
        int progress = this.H + seekBar.getProgress();
        if (progress != this.G) {
            if (a(Integer.valueOf(progress))) {
                N(progress, false);
            } else {
                seekBar.setProgress(this.G - this.H);
                P(this.G);
            }
        }
    }

    void P(int i10) {
        TextView textView = this.f4470a0;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }
}
