/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package printerconfig.example.co.za.printerconfigmenues;

/**
 * {@link CustomMenuItem} represents a single menu item
 */
public class CustomMenuItem {

    // Menu description
    private String description;

    // Drawable resource ID
    private int mImageResourceId;

    public CustomMenuItem(String description, int imageResourceId) {
        this.description = description;
        this.mImageResourceId = imageResourceId;
    }


    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}
