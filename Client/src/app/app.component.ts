import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ContoCorrente } from './conto-corrente';
import { ContoCorrenteDto } from './conto-corrente-dto';
import { ListaContoCorrenteDto } from './lista-conto-correnti-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http: HttpClient) {

  }
  url = "http://localhost:8080/";

  contoCorrente = new ContoCorrente();

  contiCorrente: ContoCorrente[] = [];

  aggiungi() {
    let dto = new ContoCorrenteDto();
    dto.contoCorrente = this.contoCorrente;
<<<<<<< Updated upstream
    this.http.post<ContoCorrenteDto>(this.url + "aggiungi", dto)
    .subscribe(f=>this.contoCorrente=f.contoCorrente)
  }

  cancella() {
=======
    console.log(this.contoCorrente);
    this.http.post<ListaContoCorrenteDto>(this.url + "aggiungi", dto)
      .subscribe(f => {
        this.contiCorrente = f.contiCorrente;
        this.contoCorrente = new ContoCorrente();
        for (let i = this.contoCorrente.id = 0; i <= this.contiCorrente.length; i++) {
          console.log(i);
        }
>>>>>>> Stashed changes

      });
  }

  elimina() {
    let dto = new ContoCorrenteDto();
    dto.contoCorrente = this.contoCorrente;
    this.http.post<ListaContoCorrenteDto>(this.url + "elimina", dto)
      .subscribe(r => this.contiCorrente = r.contiCorrente);
  }
}
