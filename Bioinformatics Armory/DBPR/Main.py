from Bio import ExPASy
from Bio import SwissProt

def main():
    code = raw_input()
    handle = ExPASy.get_sprot_raw(code)
    record = SwissProt.read(handle)
    
    

main()