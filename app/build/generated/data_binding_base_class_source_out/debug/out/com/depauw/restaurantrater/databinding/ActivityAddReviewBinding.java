// Generated by view binder compiler. Do not edit!
package com.depauw.restaurantrater.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.depauw.restaurantrater.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddReviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAddReview;

  @NonNull
  public final CheckBox checkboxFavorite;

  @NonNull
  public final EditText edittextRestaurantName;

  @NonNull
  public final EditText edittextReviewDate;

  @NonNull
  public final EditText edittextReviewTime;

  @NonNull
  public final TextView labelDate;

  @NonNull
  public final TextView labelRating;

  @NonNull
  public final TextView labelRestaurant;

  @NonNull
  public final TextView labelTime;

  @NonNull
  public final RadioButton radioBreakfast;

  @NonNull
  public final RadioButton radioDinner;

  @NonNull
  public final RadioButton radioLunch;

  @NonNull
  public final RadioGroup radiogroupMeals;

  @NonNull
  public final SeekBar seekbarRating;

  private ActivityAddReviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonAddReview, @NonNull CheckBox checkboxFavorite,
      @NonNull EditText edittextRestaurantName, @NonNull EditText edittextReviewDate,
      @NonNull EditText edittextReviewTime, @NonNull TextView labelDate,
      @NonNull TextView labelRating, @NonNull TextView labelRestaurant, @NonNull TextView labelTime,
      @NonNull RadioButton radioBreakfast, @NonNull RadioButton radioDinner,
      @NonNull RadioButton radioLunch, @NonNull RadioGroup radiogroupMeals,
      @NonNull SeekBar seekbarRating) {
    this.rootView = rootView;
    this.buttonAddReview = buttonAddReview;
    this.checkboxFavorite = checkboxFavorite;
    this.edittextRestaurantName = edittextRestaurantName;
    this.edittextReviewDate = edittextReviewDate;
    this.edittextReviewTime = edittextReviewTime;
    this.labelDate = labelDate;
    this.labelRating = labelRating;
    this.labelRestaurant = labelRestaurant;
    this.labelTime = labelTime;
    this.radioBreakfast = radioBreakfast;
    this.radioDinner = radioDinner;
    this.radioLunch = radioLunch;
    this.radiogroupMeals = radiogroupMeals;
    this.seekbarRating = seekbarRating;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_review, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddReviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_add_review;
      Button buttonAddReview = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddReview == null) {
        break missingId;
      }

      id = R.id.checkbox_favorite;
      CheckBox checkboxFavorite = ViewBindings.findChildViewById(rootView, id);
      if (checkboxFavorite == null) {
        break missingId;
      }

      id = R.id.edittext_restaurant_name;
      EditText edittextRestaurantName = ViewBindings.findChildViewById(rootView, id);
      if (edittextRestaurantName == null) {
        break missingId;
      }

      id = R.id.edittext_review_date;
      EditText edittextReviewDate = ViewBindings.findChildViewById(rootView, id);
      if (edittextReviewDate == null) {
        break missingId;
      }

      id = R.id.edittext_review_time;
      EditText edittextReviewTime = ViewBindings.findChildViewById(rootView, id);
      if (edittextReviewTime == null) {
        break missingId;
      }

      id = R.id.label_date;
      TextView labelDate = ViewBindings.findChildViewById(rootView, id);
      if (labelDate == null) {
        break missingId;
      }

      id = R.id.label_rating;
      TextView labelRating = ViewBindings.findChildViewById(rootView, id);
      if (labelRating == null) {
        break missingId;
      }

      id = R.id.label_restaurant;
      TextView labelRestaurant = ViewBindings.findChildViewById(rootView, id);
      if (labelRestaurant == null) {
        break missingId;
      }

      id = R.id.label_time;
      TextView labelTime = ViewBindings.findChildViewById(rootView, id);
      if (labelTime == null) {
        break missingId;
      }

      id = R.id.radio_breakfast;
      RadioButton radioBreakfast = ViewBindings.findChildViewById(rootView, id);
      if (radioBreakfast == null) {
        break missingId;
      }

      id = R.id.radio_dinner;
      RadioButton radioDinner = ViewBindings.findChildViewById(rootView, id);
      if (radioDinner == null) {
        break missingId;
      }

      id = R.id.radio_lunch;
      RadioButton radioLunch = ViewBindings.findChildViewById(rootView, id);
      if (radioLunch == null) {
        break missingId;
      }

      id = R.id.radiogroup_meals;
      RadioGroup radiogroupMeals = ViewBindings.findChildViewById(rootView, id);
      if (radiogroupMeals == null) {
        break missingId;
      }

      id = R.id.seekbar_rating;
      SeekBar seekbarRating = ViewBindings.findChildViewById(rootView, id);
      if (seekbarRating == null) {
        break missingId;
      }

      return new ActivityAddReviewBinding((ConstraintLayout) rootView, buttonAddReview,
          checkboxFavorite, edittextRestaurantName, edittextReviewDate, edittextReviewTime,
          labelDate, labelRating, labelRestaurant, labelTime, radioBreakfast, radioDinner,
          radioLunch, radiogroupMeals, seekbarRating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
