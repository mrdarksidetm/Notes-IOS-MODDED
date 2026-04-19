package com.revenuecat.purchases.ui.revenuecatui.components.style;

import ae.j;
import ae.r;
import ae.s;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewState;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverrides;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ScreenCondition;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import h0.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l1.m1;
import l1.t1;
import md.i0;
import md.q;
import nd.u;
import nd.v;
import t0.f3;
import t0.o;
import t0.p3;
import w2.h;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class StyleFactory {
    private static final Companion Companion = new Companion(null);
    private static final t1 DEFAULT_SHAPE = m1.a();
    private static final float DEFAULT_SPACING = 0.0f;
    private final ComponentViewState componentState;
    private final boolean isEligibleForIntroOffer;
    private final Locale locale;
    private final Map<LocalizationKey, LocalizationData> localizationDictionary;
    private final PackageContext packageContext;
    private final VariableDataProvider variables;
    private final ScreenCondition windowSize;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createStackComponentStyle$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<PartialStackComponent, Result<? extends PresentedStackPartial, ? extends PaywallValidationError>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // zd.l
        public final Result<PresentedStackPartial, PaywallValidationError> invoke(PartialStackComponent partialStackComponent) {
            r.f(partialStackComponent, "partial");
            return new Result.Success(new PresentedStackPartial(partialStackComponent));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTextComponentStyle$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l<PartialTextComponent, Result<? extends LocalizedTextPartial, ? extends PaywallValidationError>> {
        AnonymousClass2() {
            super(1);
        }

        @Override // zd.l
        public final Result<LocalizedTextPartial, PaywallValidationError> invoke(PartialTextComponent partialTextComponent) {
            r.f(partialTextComponent, "it");
            return LocalizedTextPartial.Companion.invoke(partialTextComponent, StyleFactory.this.localizationDictionary);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyleFactory(ScreenCondition screenCondition, boolean z10, ComponentViewState componentViewState, PackageContext packageContext, Map<LocalizationKey, ? extends LocalizationData> map, Locale locale, VariableDataProvider variableDataProvider) {
        r.f(screenCondition, "windowSize");
        r.f(componentViewState, "componentState");
        r.f(packageContext, "packageContext");
        r.f(map, "localizationDictionary");
        r.f(locale, "locale");
        r.f(variableDataProvider, "variables");
        this.windowSize = screenCondition;
        this.isEligibleForIntroOffer = z10;
        this.componentState = componentViewState;
        this.packageContext = packageContext;
        this.localizationDictionary = map;
        this.locale = locale;
        this.variables = variableDataProvider;
    }

    private final Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> createStackComponentStyle(StackComponent stackComponent, t0.l lVar, int i10) {
        Dimension dimension;
        Size size;
        Float spacing;
        ColorScheme backgroundColor;
        Padding padding;
        Padding margin;
        Shape shape;
        t1 shape2;
        Border border;
        Shadow shadow;
        Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> success;
        Boolean visible;
        PresentedStackPartial presentedStackPartial;
        lVar.e(-1064579576);
        if (o.I()) {
            o.U(-1064579576, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.createStackComponentStyle (StyleFactory.kt:72)");
        }
        ComponentOverrides overrides = stackComponent.getOverrides();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(overrides != null ? PresentedPartialKt.toPresentedOverrides(overrides, AnonymousClass1.INSTANCE) : null);
        if (!(resultOrSuccessfullyNull instanceof Result.Success)) {
            if (!(resultOrSuccessfullyNull instanceof Result.Error)) {
                throw new q();
            }
            resultOrSuccessfullyNull = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) resultOrSuccessfullyNull).getValue(), new PaywallValidationError[0]));
        }
        List components = stackComponent.getComponents();
        ArrayList<Result> arrayList = new ArrayList(v.x(components, 10));
        Iterator it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(create((PaywallComponent) it.next(), lVar, 72));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((ComponentStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        i0 i0Var = i0.f15558a;
        Result.Success success2 = new Result.Success(i0Var);
        Result.Success success3 = new Result.Success(i0Var);
        boolean zBooleanValue = true;
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(u.p(resultOrSuccessfullyNull, error, success2, success3)));
        if (nonEmptyListOrNull2 != null) {
            success = new Result.Error<>(nonEmptyListOrNull2);
        } else {
            r.d(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) resultOrSuccessfullyNull).getValue();
            Object value2 = ((Result.Success) error).getValue();
            Object value3 = success2.getValue();
            List list = (List) value2;
            PresentedOverrides presentedOverrides = (PresentedOverrides) value;
            PartialStackComponent partial = (presentedOverrides == null || (presentedStackPartial = (PresentedStackPartial) PresentedPartialKt.buildPresentedPartial(presentedOverrides, this.windowSize, this.isEligibleForIntroOffer, this.componentState)) == null) ? null : presentedStackPartial.getPartial();
            if (partial != null && (visible = partial.getVisible()) != null) {
                zBooleanValue = visible.booleanValue();
            }
            boolean z10 = zBooleanValue;
            if (partial == null || (dimension = partial.getDimension()) == null) {
                dimension = stackComponent.getDimension();
            }
            Dimension dimension2 = dimension;
            if (partial == null || (size = partial.getSize()) == null) {
                size = stackComponent.getSize();
            }
            Size size2 = size;
            float fM = h.m(((partial == null || (spacing = partial.getSpacing()) == null) && (spacing = stackComponent.getSpacing()) == null) ? 0.0f : spacing.floatValue());
            if (partial == null || (backgroundColor = partial.getBackgroundColor()) == null) {
                backgroundColor = stackComponent.getBackgroundColor();
            }
            lVar.e(1498095714);
            BackgroundStyle backgroundStyle = backgroundColor == null ? null : BackgroundStyleKt.toBackgroundStyle(backgroundColor, lVar, 8);
            lVar.K();
            if (partial == null || (padding = partial.getPadding()) == null) {
                padding = stackComponent.getPadding();
            }
            y paddingValues = PaddingKt.toPaddingValues(padding);
            if (partial == null || (margin = partial.getMargin()) == null) {
                margin = stackComponent.getMargin();
            }
            y paddingValues2 = PaddingKt.toPaddingValues(margin);
            if (partial == null || (shape = partial.getShape()) == null) {
                shape = stackComponent.getShape();
            }
            if (shape == null || (shape2 = ShapeKt.toShape(shape)) == null) {
                shape2 = DEFAULT_SHAPE;
            }
            t1 t1Var = shape2;
            if (partial == null || (border = partial.getBorder()) == null) {
                border = stackComponent.getBorder();
            }
            lVar.e(1498096039);
            BorderStyle borderStyle = border == null ? null : BorderStyleKt.toBorderStyle(border, lVar, 8);
            lVar.K();
            if (partial == null || (shadow = partial.getShadow()) == null) {
                shadow = stackComponent.getShadow();
            }
            success = new Result.Success<>(new StackComponentStyle(z10, list, dimension2, size2, fM, backgroundStyle, paddingValues, paddingValues2, t1Var, borderStyle, shadow != null ? ShadowStyleKt.toShadowStyle(shadow, lVar, 8) : null, null));
        }
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return success;
    }

    private final Result<TextComponentStyle, NonEmptyList<PaywallValidationError>> createTextComponentStyle(TextComponent textComponent, t0.l lVar, int i10) {
        String text;
        ColorScheme color;
        FontSize fontSize;
        FontWeight fontWeight;
        String fontName;
        HorizontalAlignment horizontalAlignment;
        HorizontalAlignment horizontalAlignment2;
        ColorScheme backgroundColor;
        Size size;
        Padding padding;
        Padding margin;
        Result<TextComponentStyle, NonEmptyList<PaywallValidationError>> success;
        Boolean visible;
        lVar.e(249423040);
        if (o.I()) {
            o.U(249423040, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.createTextComponentStyle (StyleFactory.kt:108)");
        }
        Result resultM89string7v81vok = LocalizationKt.m89string7v81vok(this.localizationDictionary, textComponent.m33getTextz7Tp4o());
        if (!(resultM89string7v81vok instanceof Result.Success)) {
            if (!(resultM89string7v81vok instanceof Result.Error)) {
                throw new q();
            }
            resultM89string7v81vok = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError.MissingStringLocalization) ((Result.Error) resultM89string7v81vok).getValue(), new PaywallValidationError.MissingStringLocalization[0]));
        }
        ComponentOverrides overrides = textComponent.getOverrides();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(overrides != null ? PresentedPartialKt.toPresentedOverrides(overrides, new AnonymousClass2()) : null);
        if (resultOrSuccessfullyNull instanceof Result.Success) {
            PresentedOverrides presentedOverrides = (PresentedOverrides) ((Result.Success) resultOrSuccessfullyNull).getValue();
            resultOrSuccessfullyNull = new Result.Success(presentedOverrides != null ? (LocalizedTextPartial) PresentedPartialKt.buildPresentedPartial(presentedOverrides, this.windowSize, this.isEligibleForIntroOffer, this.componentState) : null);
        } else if (!(resultOrSuccessfullyNull instanceof Result.Error)) {
            throw new q();
        }
        if (!(resultOrSuccessfullyNull instanceof Result.Success)) {
            if (!(resultOrSuccessfullyNull instanceof Result.Error)) {
                throw new q();
            }
            resultOrSuccessfullyNull = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) resultOrSuccessfullyNull).getValue(), new PaywallValidationError[0]));
        }
        i0 i0Var = i0.f15558a;
        Result.Success success2 = new Result.Success(i0Var);
        Result.Success success3 = new Result.Success(i0Var);
        boolean zBooleanValue = true;
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(u.p(resultM89string7v81vok, resultOrSuccessfullyNull, success2, success3)));
        if (nonEmptyListOrNull != null) {
            success = new Result.Error<>(nonEmptyListOrNull);
        } else {
            r.d(resultM89string7v81vok, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) resultM89string7v81vok).getValue();
            r.d(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value2 = ((Result.Success) resultOrSuccessfullyNull).getValue();
            Object value3 = success2.getValue();
            LocalizedTextPartial localizedTextPartial = (LocalizedTextPartial) value2;
            String str = (String) value;
            PartialTextComponent partial = localizedTextPartial != null ? localizedTextPartial.getPartial() : null;
            TextComponentStyle.Companion companion = TextComponentStyle.Companion;
            if (partial != null && (visible = partial.getVisible()) != null) {
                zBooleanValue = visible.booleanValue();
            }
            boolean z10 = zBooleanValue;
            if (localizedTextPartial == null || (text = localizedTextPartial.getText()) == null) {
                text = str;
            }
            String strRememberProcessedText = rememberProcessedText(text, this.packageContext, this.variables, this.locale, lVar, 36864);
            if (partial == null || (color = partial.getColor()) == null) {
                color = textComponent.getColor();
            }
            ColorScheme colorScheme = color;
            if (partial == null || (fontSize = partial.getFontSize()) == null) {
                fontSize = textComponent.getFontSize();
            }
            FontSize fontSize2 = fontSize;
            if (partial == null || (fontWeight = partial.getFontWeight()) == null) {
                fontWeight = textComponent.getFontWeight();
            }
            FontWeight fontWeight2 = fontWeight;
            if (partial == null || (fontName = partial.getFontName()) == null) {
                fontName = textComponent.getFontName();
            }
            String str2 = fontName;
            if (partial == null || (horizontalAlignment = partial.getHorizontalAlignment()) == null) {
                horizontalAlignment = textComponent.getHorizontalAlignment();
            }
            if (partial == null || (horizontalAlignment2 = partial.getHorizontalAlignment()) == null) {
                horizontalAlignment2 = textComponent.getHorizontalAlignment();
            }
            HorizontalAlignment horizontalAlignment3 = horizontalAlignment2;
            if (partial == null || (backgroundColor = partial.getBackgroundColor()) == null) {
                backgroundColor = textComponent.getBackgroundColor();
            }
            ColorScheme colorScheme2 = backgroundColor;
            if (partial == null || (size = partial.getSize()) == null) {
                size = textComponent.getSize();
            }
            Size size2 = size;
            if (partial == null || (padding = partial.getPadding()) == null) {
                padding = textComponent.getPadding();
            }
            Padding padding2 = padding;
            if (partial == null || (margin = partial.getMargin()) == null) {
                margin = textComponent.getMargin();
            }
            success = new Result.Success(companion.invoke(z10, strRememberProcessedText, colorScheme, fontSize2, fontWeight2, str2, horizontalAlignment, horizontalAlignment3, colorScheme2, size2, padding2, margin, lVar, 1207960064, 456));
        }
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return success;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Double discountPercentage(Long l10, Long l11) {
        if (l10 == null || l11 == null || l11.longValue() <= l10.longValue()) {
            return null;
        }
        return Double.valueOf((l11.longValue() - l10.longValue()) / l11.longValue());
    }

    private final String rememberProcessedText(String str, PackageContext packageContext, VariableDataProvider variableDataProvider, Locale locale, t0.l lVar, int i10) {
        lVar.e(1323249832);
        if (o.I()) {
            o.U(1323249832, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.rememberProcessedText (StyleFactory.kt:150)");
        }
        lVar.e(1618982084);
        boolean zN = lVar.N(packageContext) | lVar.N(variableDataProvider) | lVar.N(locale);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = f3.e(new StyleFactory$rememberProcessedText$processedText$2$1(packageContext, str, this, variableDataProvider, locale));
            lVar.E(objF);
        }
        lVar.K();
        String strRememberProcessedText$lambda$9 = rememberProcessedText$lambda$9((p3) objF);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return strRememberProcessedText$lambda$9;
    }

    private static final String rememberProcessedText$lambda$9(p3<String> p3Var) {
        return p3Var.getValue();
    }

    public final Result<ComponentStyle, NonEmptyList<PaywallValidationError>> create(PaywallComponent paywallComponent, t0.l lVar, int i10) {
        Result<ComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateTextComponentStyle;
        r.f(paywallComponent, "component");
        lVar.e(2073906442);
        if (o.I()) {
            o.U(2073906442, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.create (StyleFactory.kt:60)");
        }
        if (paywallComponent instanceof ButtonComponent) {
            lVar.e(-555597046);
            lVar.K();
            throw new md.r("An operation is not implemented: ButtonComponentStyle is not yet implemented.");
        }
        if (paywallComponent instanceof ImageComponent) {
            lVar.e(-555596960);
            lVar.K();
            throw new md.r("An operation is not implemented: ImageComponentStyle is not yet implemented.");
        }
        if (paywallComponent instanceof PackageComponent) {
            lVar.e(-555596873);
            lVar.K();
            throw new md.r("An operation is not implemented: PackageComponentStyle is not yet implemented.");
        }
        if (paywallComponent instanceof PurchaseButtonComponent) {
            lVar.e(-555596777);
            lVar.K();
            throw new md.r("An operation is not implemented: PurchaseButtonComponentStyle is not yet implemented.");
        }
        if (paywallComponent instanceof StackComponent) {
            lVar.e(-555596683);
            resultCreateTextComponentStyle = createStackComponentStyle((StackComponent) paywallComponent, lVar, 72);
        } else {
            if (paywallComponent instanceof StickyFooterComponent) {
                lVar.e(-555596594);
                lVar.K();
                throw new md.r("An operation is not implemented: StickyFooterComponentStyle is not yet implemented.");
            }
            if (!(paywallComponent instanceof TextComponent)) {
                lVar.e(-555600582);
                lVar.K();
                throw new q();
            }
            lVar.e(-555596503);
            resultCreateTextComponentStyle = createTextComponentStyle((TextComponent) paywallComponent, lVar, 72);
        }
        lVar.K();
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return resultCreateTextComponentStyle;
    }
}
