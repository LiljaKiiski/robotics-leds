#include "FastLED.h"
#include "FastLED_RGBW.h"

//Pins
#define DATA_PIN 8

//Leds
#define NUM_LEDS 20
<<<<<<< HEAD
CRGBW leds[NUM_LEDS];
=======
CRGB leds[NUM_LEDS];
>>>>>>> f9f0ecb875028b202a395295424977d7d91088e1
CRGB *ledsRGB = (CRGB *) &leds[0];
const uint8_t brightness = 128;

void setup(){
  Serial.begin(9600);

  FastLED.addLeds<WS2812B, DATA_PIN, RGB>(ledsRGB, getRGBWsize(NUM_LEDS)); //Init LEDs
//  FastLED.addLeds<NEOPIXEL, DATA_PIN>(leds, NUM_LEDS);
  FastLED.setBrightness(brightness);

<<<<<<< HEAD
  clear_leds();
  //gradient(CRGB::Yellow, CRGB::Purple);
  FastLED.show();
=======
  //clear_leds();
  gradient(CRGB::Purple, CRGB::Yellow);
  //double_gradient(CRGB::Purple, CRGB::Yellow);
  //gradient(CRGB::Purple, CRGB::Yellow);
  //fill_all(CRGB::Red);
>>>>>>> f9f0ecb875028b202a395295424977d7d91088e1
}

void loop(){
  //moving_gradient();
  //FastLED.show();
}

void clear_leds(){
  for (int x = 0; x < NUM_LEDS; x++){
    leds[x] = CRGB::Black; 
  }
  FastLED.show();
}

void all(){
   morse_code();
  delay(1000);
  bouncing_dot();
  delay(1000);
  fading_rainbow();
  delay(1000);
  fill_all(CRGB::Green);
  delay(1000);
  mvrt_pattern();
  delay(1000);
  moving_rainbow();
  delay(1000);
}
