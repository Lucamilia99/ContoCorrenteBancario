import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ContoCorrente } from './conto-corrente';
import { ContoCorrenteDto } from './conto-corrente-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http: HttpClient) {

  }
  url="http://localhost:8080/";

  contoCorrente = new ContoCorrente();

  contiCorrente: ContoCorrente[] = [];

  aggiungi() {
    let dto = new ContoCorrenteDto();
    dto.contoCorrente = this.contoCorrente;
    this.http.post<ContoCorrenteDto>(this.url + "aggiungi", dto)
    .subscribe(f=>this.contoCorrente=f.contoCorrente)
  }

  cancella() {

  }
}
