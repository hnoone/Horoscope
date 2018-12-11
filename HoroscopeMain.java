package com.example.hallenoone.horoscope;

public class HoroscopeMain {
    public class Horoscope {
        public void Zodiac(String birthMonth, int birthDay) {
            String zodSign = "";
            if (birthMonth == "January") {
                if (birthDay < 20) {
                    zodSign = "Capricorn";
                } else {
                    zodSign = "Aquarius";
                }
            }
            if (birthMonth == "February") {
                if (birthDay < 19) {
                    zodSign = "Aquarius";
                } else {
                    zodSign = "Pisces";
                }
            }
            if (birthMonth == "March") {
                if (birthDay < 21) {
                    zodSign = "Pisces";
                } else {
                    zodSign = "Aries";
                }
            }
            if (birthMonth == "April") {
                if (birthDay < 20) {
                    zodSign = "Aries";
                } else {
                    zodSign = "Taurus";
                }
            }
            if (birthMonth == "May") {
                if (birthDay < 21) {
                    zodSign = "Taurus";
                } else {
                    zodSign = "Gemini";
                }
            }
            if (birthMonth == "June") {
                if (birthDay < 21) {
                    zodSign = "Gemini";
                } else {
                    zodSign = "Cancer";
                }
            }
            if (birthMonth == "July") {
                if (birthDay < 23) {
                    zodSign = "Cancer";
                } else {
                    zodSign = "Leo";
                }
            }
            if (birthMonth == "August") {
                if (birthDay < 23) {
                    zodSign = "Leo";
                } else {
                    zodSign = "Virgo";
                }
            }
            if (birthMonth == "September") {
                if (birthDay < 23) {
                    zodSign = "Virgo";
                } else {
                    zodSign = "Libra";
                }
            }
            if (birthMonth == "October") {
                if (birthDay < 23) {
                    zodSign = "Libra";
                } else {
                    zodSign = "Scorpio";
                }
            }
            if (birthMonth == "November") {
                if (birthDay < 22) {
                    zodSign = "Scorpio";
                } else {
                    zodSign = "Sagittarius";
                }
            }
            if (birthMonth == "December") {
                if (birthDay < 22) {
                    zodSign = "Sagittarius";
                } else {
                    zodSign = "Capricorn";
                }
            }
        }
    }
}
