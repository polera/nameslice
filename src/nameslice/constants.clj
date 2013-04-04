(ns nameslice.constants)

(def salutations 
  (re-pattern
    (str "(?i)MR|MS|MRS|DR|MISS|DOCTOR|CORP|SGT|PVT|JUDGE|"
         "CAPT|COL|MAJ|LT|LIEUTENANT|PRM|PATROLMAN|HON|"
         "OFFICER|REV|PRES|PRESIDENT|"
         "GOV|GOVERNOR|VICE PRESIDENT|VP|MAYOR|SIR|MADAM|HONERABLE|"
         "PRINCESS|PRINCE|KING|QUEEN")))

(def generations 
  (re-pattern
    (str "(?i)JR|SR|I|II|III|IV|V|VI|VII|VIII|IX|X|"
        "1ST|2ND|3RD|4TH|5TH|6TH|7TH|8TH|9TH|10TH|"
        "FIRST|SECOND|THIRD|FOURTH|FIFTH|SIXTH|SEVENTH|"
        "EIGHTH|NINTH|TENTH")))

(def suffixes #"(?i)ESQ|PHD|MD")

(def ln-prefixes
  (re-pattern
     (str "(?i)DE|DA|DI|LA|DU|DEL|DEI|VDA|DELLO|DELLA|"
         "DEGLI|DELLE|VAN|VON|DER|DEN|HEER|TEN|TER|"
         "VANDE|VANDEN|VANDER|VOOR|VER|AAN|MC|BEN|SAN|"
         "SAINZ|BIN|LI|LE|DES|AM|AUS'M|VOM|ZUM|ZUR|TEN|IBN")))

;; Non-name values
(def non-name #"(?i)A\.K\.A|AKA|A\/K\/A|FKA|F\/K\/A|N\/K\/A|FICTITIOUS|THE")

(def corp-entity
  (re-pattern
     (str "(?i)NA|CORP|CO|INC|ASSOCIATES|SERVICE|LLC|LLP|PARTNERS|"
         "R/A|C/O|COUNTY|STATE|"
         "BANK|GROUP|MUTUAL|FARGO")))

(def supplemental-info #"(?i)WIFE|HUSBAND|SON|DAUGHTER|HEIR|HEIRESS")

;; Constant character with which to replace unwanted
(def replacement-char "")
