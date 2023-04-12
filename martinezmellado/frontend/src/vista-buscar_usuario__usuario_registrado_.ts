import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-usuario__usuario_registrado_';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscar_usuario__usuario_registrado_')
export class VistaBuscar_usuario__usuario_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 95%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 100%;">
   <vista-usuario__usuario_registrado_></vista-usuario__usuario_registrado_>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-text-field id="TextField" style="width: 60%;"></vaadin-text-field>
   <vaadin-button id="BuscarUsuario" style="width: 60%;">
    Buscar Usuario
   </vaadin-button>
   <vaadin-button id="BuscarHashtag" style="width: 60%;">
    Buscar Hashtag 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
